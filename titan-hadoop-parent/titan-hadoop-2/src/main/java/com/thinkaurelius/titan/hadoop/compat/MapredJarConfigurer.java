package com.thinkaurelius.titan.hadoop.compat;

import java.io.IOException;

import org.apache.hadoop.mapreduce.Job;

public class MapredJarConfigurer implements JobClasspathConfigurer {

    private final String mapredJar;

    public MapredJarConfigurer(String mapredJar) {
        this.mapredJar = mapredJar;
    }

    @Override
    public void configure(Job job) throws IOException {
        job.setJar(mapredJar);
    }
}
