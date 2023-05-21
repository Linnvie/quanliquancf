package com.ptit.controller;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptit.entity.ProductEntity;

@Transactional
@Controller
public class HomeController {

	@Autowired
	SessionFactory factory;
	
	@RequestMapping("nhan-vien/trang-chu")
	public String index(ModelMap model) {
//		List<ProductEntity> sanpham = this.getSanPham();		
//		model.addAttribute("sanpham", sanpham);
		return "admin/admin";
	}
	
	public List<ProductEntity> getSanPham(){
		Session session = factory.getCurrentSession();
		String hql = "FROM ProductEntity";
		Query query = session.createQuery(hql);
		List<ProductEntity> list = query.list();
		return list;
	}
}
