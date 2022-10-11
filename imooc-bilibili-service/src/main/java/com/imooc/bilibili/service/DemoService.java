package com.imooc.bilibili.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.bilibili.dao.DemoDao;

@Service
public class DemoService {
  @Autowired
  private DemoDao demoDao;

  public Long query(Long id) {
    return demoDao.query(id);
  }
}
