package com.cp.compiler.services;

import com.cp.compiler.models.Result;

import java.io.IOException;

public interface ContainerService {
    int buildImage(String folder, String imageName);

    Result runCode(String imageName);

    String getRunningContainers() throws IOException;

    String getImages() throws IOException;

    String getContainersStats() throws IOException;

    String getAllContainersStats() throws IOException;

    String deleteImage(String imageName) throws IOException;

}
