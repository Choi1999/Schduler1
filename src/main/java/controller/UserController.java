package controller;

import entity.User;
import service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 사용자 등록 폼
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // register.html로 이동
    }

    // 사용자 등록 처리
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/auth/login"; // 로그인 페이지로 리다이렉트
    }

    // 사용자 정보 수정 폼
    @GetMapping("/{id}/edit")
    public String showEditUserForm(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "editUser"; // editUser.html로 이동
    }

    // 사용자 정보 수정 처리
    @PostMapping("/{id}/edit")
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/auth/login"; // 수정 후 로그인 페이지로 리다이렉트
    }

    // 사용자 삭제 처리
    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/auth/login"; // 삭제 후 로그인 페이지로 리다이렉트
    }
}