/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_2_io2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Create200MBFile {

    public static void main(String[] args) {
        String dirPath = "C:\\mydir";
        String filePath = dirPath + "\\test_200mb.dat";

        // 200 MB = 200 * 1024 * 1024 bytes
        long fileSize = 200L * 1024 * 1024;

        File dir = new File(dirPath);

        // 如果資料夾不存在，就建立
        if (!dir.exists()) {
            boolean created = dir.mkdirs();

            if (created) {
                System.out.println("資料夾建立成功：" + dirPath);
            } else {
                System.out.println("資料夾建立失敗：" + dirPath);
                return;
            }
        } else {
            System.out.println("資料夾已存在：" + dirPath);
        }

        File file = new File(filePath);

        // 建立 200MB 檔案
        try (FileOutputStream fos = new FileOutputStream(file)) {

            byte[] buffer = new byte[1024 * 1024]; // 每次寫入 1MB
            Random random = new Random();

            long written = 0;
   while (written < fileSize) {
                random.nextBytes(buffer);

                long remaining = fileSize - written;

                if (remaining >= buffer.length) {
                    fos.write(buffer);
                    written += buffer.length;
                } else {
                    fos.write(buffer, 0, (int) remaining);
                    written += remaining;
                }
            }

            System.out.println("200MB 檔案建立完成：");
            System.out.println(filePath);

        } catch (IOException e) {
            System.out.println("建立檔案時發生錯誤：");
            e.printStackTrace();
        }
    }
}
