package com.example.awslocalstack.Controller;

import com.example.awslocalstack.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final S3Service s3Service;

    @GetMapping("/id")
    public String sendMessage() {
        s3Service.listObjects("bucket-example");
        return "Hello World";
    }

    @GetMapping(value = "/{bucketName}/objects/{objectName}")
    public File downloadObject(@PathVariable String bucketName, @PathVariable String objectName) {
        s3Service.downloadObject(bucketName, objectName);
        return new File("./" + objectName);
    }

}