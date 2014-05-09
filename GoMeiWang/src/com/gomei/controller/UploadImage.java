package com.gomei.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadImage {

	@RequestMapping(value="/addImage", method=RequestMethod.GET)
	public String addImage(Model model){
		return "upload";
	}
	
	@RequestMapping(value="/addImage", method=RequestMethod.POST)
	public String addImage(@RequestParam MultipartFile[] files, HttpServletRequest request){
		String realPath = request.getSession().getServletContext().getRealPath("/resources/upload");
		for(MultipartFile file : files){
			if(file.isEmpty())
				continue;
			File f = new File(realPath + "\\" + file.getOriginalFilename());	
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "upload";
	}

}
