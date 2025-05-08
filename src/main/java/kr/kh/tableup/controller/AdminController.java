package kr.kh.tableup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kh.tableup.model.vo.AdminVO;
import kr.kh.tableup.model.vo.UserVO;
import kr.kh.tableup.service.AdminService;
import kr.kh.tableup.service.UserService;

@Controller
public class AdminController {

	@Autowired
  AdminService adminService;

  @Autowired
  PasswordEncoder passwordEncoder;

	@GetMapping("/signup/admin")
	public String adminSignupForm(Model model) {
    model.addAttribute("url", "/signup/admin");
    return "admin/signup";
	}

	@PostMapping("/signup/admin")
  public String signup(AdminVO admin) {
    admin.setAd_pw(passwordEncoder.encode(admin.getAd_pw()));
    adminService.insertAdmin(admin);
    return "redirect:/";
    // return "redirect:/admin";
  }
}
