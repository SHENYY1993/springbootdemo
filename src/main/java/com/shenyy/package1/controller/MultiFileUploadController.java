package com.shenyy.package1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


/**
 * @methodName:     MultiFileUploadController
 * @description:    多文件上传
 * @param:
 * @return:         上传文件的列表
 * @author: shenyy
 * @time: 2022/3/2
 */
@RestController
public class MultiFileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/uploads")
    public ArrayList<String> upload(MultipartFile[] uploadFiles, HttpServletRequest req) {
        ArrayList<String> filePathList = new ArrayList<>();
        //遍历uploadFiles数组，并分别存储
        for (int i = 0; i < uploadFiles.length; i++) {
            MultipartFile uploadFile = uploadFiles[i];
            String realPath = req.getSession().getServletContext().getRealPath("/uploadFiles/");
            String format = sdf.format(new Date());
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

            try {
                uploadFile.transferTo(new File(folder, newName));
                String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFiles/" + format + newName;
//                return filePath;
                filePathList.add(filePath);
            } catch (IOException e) {
                e.printStackTrace();
//            return "上传失败";
                filePathList.add("上传失败");
            }

        }
        return filePathList;
    }
}
