package com.example.appbanhang.utils;

import com.example.appbanhang.Interface.model.GioHang;
import com.example.appbanhang.Interface.model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final String BASE_URL="http://10.2.9.81/banhang/";
    public  static List<GioHang> manggiohang;
    public  static List<GioHang> mangmuahang = new ArrayList<>();
    public static User user_current = new User();
    public static String ID_RECEIVED;
    public static final String SENDID = "idsend";
    public static final String RECEIVEDID = "idreceived";
    public static final String MESS = "message";
    public static final String DATETIME = "datetime";
    public static final String PATH_CHAT = "chat";




    public static String statusOrder(int status){
        String result = "";
        switch (status){
            case 0:
                result = "Chờ xác nhận";
                break;
            case 1:
                result = "Đã xác nhận";
                break;
            case 2:
                result = "Đơn hàng đã giao cho đơn vị vận chuyển";
                break;
            case 3:
                result = "Giao hàng thành công";
                break;
            case 4:
                result = "Đơn hàng đã hủy";
                break;
            default:
                result = "...";
        }

        return  result;
    }
}
