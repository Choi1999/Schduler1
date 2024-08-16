package controller;

import entity.User;
import service.AuthService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // 로그인 요청 처리
    public void login(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = authService.login(email, password);
        if (user != null) {
            // 로그인 성공 처리 (예: 세션에 사용자 정보 저장)
            request.getSession().setAttribute("currentUser", user);
            // 성공 페이지로 리다이렉트
            response.sendRedirect("success.jsp");
        } else {
            // 로그인 실패 처리 (예: 오류 메시지 표시)
            request.setAttribute("errorMessage", "Invalid email or password.");
            // 로그인 페이지로 포워드
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // 로그아웃 요청 처리
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        authService.logout(); // AuthService를 통해 로그아웃 처리
        request.getSession().invalidate(); // 세션 무효화
        // 로그인 페이지로 리다이렉트
        response.sendRedirect("login.jsp");
    }

    // 사용자 등록 요청 처리
    public void register(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User newUser = new User();
        newUser.setEmail(email);
        newUser.setPassword(password);

        authService.registerUser(newUser); // 사용자 등록
        // 로그인 페이지로 리다이렉트
        response.sendRedirect("login.jsp");
    }

    // 현재 사용자 정보 조회
    public User getCurrentUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute("currentUser");
    }
}