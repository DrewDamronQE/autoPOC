package Core;

import net.lingala.zip4j.core.ZipFile;

import java.io.*;
import java.net.*;

public class FeatureFetch {
    public FeatureFetch(){
        try {

            URL url = new URL("https://behave.pro/rest/cucumber/1.0/project/10003/features?manual={true|false}");
            Authenticator.setDefault (new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("NjRhZDczZTctM2MwYy0zNmQ0LWI1ZjAtZGRhMTFiYjcwZTky", "7410289f315d4b5704b39a6069b3ec813a8bec8c".toCharArray());
                }
            });
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            InputStream inputStream = conn.getInputStream();
            FileOutputStream outputStream = new FileOutputStream("D:\\featurefetch\\features.zip");
            int bytesRead = -1;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            try{
                String featureZipFile = "D:\\featurefetch\\features.zip";
                ZipFile zipFile = new ZipFile(featureZipFile);
                File resourcesDirectory = new File("src/test/resources/features");
                zipFile.extractAll(resourcesDirectory.getPath());
                new File(featureZipFile).delete();
            }
            catch (Exception ex){
                System.console().printf(ex.getMessage());
            }



            outputStream.close();
            inputStream.close();
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
