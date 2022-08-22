package com.google.gcs.plugin;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("gcs-source-properties")
public class GCSConfig {

    String bucketName;
    String fileName;

}