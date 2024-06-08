package com.example.awsproject;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class Controller {

    private final S3Uploader s3Uploader;

    public Controller(S3Uploader s3Uploader) {
        this.s3Uploader = s3Uploader;
    }

    @GetMapping("/health_check")
    public String check() {
        return "Hello";
    }

    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("file") MultipartFile image) {
        try {
            return s3Uploader.upload(image, "image");
        } catch (IOException e) {
            e.printStackTrace();
            return "실패";
        }
    }
}
