//package archiver.model;
//
//import net.lingala.zip4j.ZipFile;
//import net.lingala.zip4j.model.ZipParameters;
//import net.lingala.zip4j.model.enums.AesKeyStrength;
//import net.lingala.zip4j.model.enums.EncryptionMethod;
//
//import java.io.File;
//import java.util.List;
//
//public class fileZip {
//    private File destFile;
//    private List<File> files;
//    String inputFileName;
//    String isLast;
//    char[] password;
//
//    public fileZip(File destFile, String inputFileName, String isLast, char[] password, List<File> files) {
//        this.destFile = destFile;
//        this.inputFileName = inputFileName;
//        this.isLast = isLast;
//        this.password = password;
//        this.files = files;
//    }
//
//    public void run() {
//        ZipParameters zipParameters = new ZipParameters();
//        zipParameters.setEncryptFiles(true);
//        zipParameters.setEncryptionMethod(EncryptionMethod.AES);
//        zipParameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);
//
//        files.forEach(file -> {
//            try {
//                ZipFile zipFile = new ZipFile(destFile.getAbsolutePath() + "\\" + inputFileName + isLast, password);
//                System.out.println(file.getAbsolutePath());
//                zipFile.addFile(new File(file.getAbsolutePath()), zipParameters);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//
//}
