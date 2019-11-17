package com.dubbo.demo.impl;

import com.dubbo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("ha", id - 1));
        demo.add(String.format("haha", id));
        demo.add(String.format("hahaha", id + 1));
        return demo;

    }
}
