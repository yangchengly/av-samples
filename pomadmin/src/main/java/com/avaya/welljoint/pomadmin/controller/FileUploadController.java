package com.avaya.welljoint.pomadmin.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avaya.welljoint.pomadmin.utils.SpreadsheetReader;

@Controller
public class FileUploadController {
	
	@Autowired
	private SpreadsheetReader spreadsheetReader;	

	@RequestMapping(method = RequestMethod.GET, value = "/upload")
	public String provideUploadInfo(Model model) {

		// File rootFolder = new File(Application.ROOT);
		//
		// model.addAttribute("files",
		// Arrays.stream(rootFolder.listFiles()).sorted(Comparator.comparingLong(f
		// -> -1 * f.lastModified()))
		// .map(f -> f.getName()).collect(Collectors.toList()));

		return "uploadForm";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public String handleFileUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {

		// String basePath = request.getScheme() + "://" +
		// request.getServerName() + ":" + request.getServerPort()
		// + request.getContextPath() + "/";

		String path = request.getSession().getServletContext().getRealPath("");

		if (name.contains("/")) {
			redirectAttributes.addFlashAttribute("message", "Folder separators not allowed");
			return "redirect:/";
		}
		if (name.contains("/")) {
			redirectAttributes.addFlashAttribute("message", "Relative pathnames not allowed");
			return "redirect:/";
		}

		if (!file.isEmpty()) {
			try {
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path + "/" + new File(name)));
				
				
				
				
//				FileCopyUtils.copy(file.getInputStream(), outputStream);
				
				
				
				outputStream.close();
				redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + name + "!");

			} catch (Exception e) {
				redirectAttributes.addFlashAttribute("message",
						"You failed to upload " + name + " => " + e.getMessage());
			}
		} else {
			redirectAttributes.addFlashAttribute("message",
					"You failed to upload " + name + " because the file was empty");
		}

		return "redirect:/";
	}

}
