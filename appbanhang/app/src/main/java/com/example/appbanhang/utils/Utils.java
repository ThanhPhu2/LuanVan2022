package com.example.appbanhang.utils;

import com.example.appbanhang.Interface.model.GioHang;
import com.example.appbanhang.Interface.model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final String BASE_URL="http://10.2.9.36/banhang/";
    public  static List<GioHang> manggiohang;
    public  static List<GioHang> mangmuahang = new ArrayList<>();
    public static User user_current = new User();
}
