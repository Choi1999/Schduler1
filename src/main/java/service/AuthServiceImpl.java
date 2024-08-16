package service;

import entity.User;

public class AuthServiceImpl implements AuthService {
    private final UserService userService;
    private User currentUser; // 현재 로그인한 사용자 저장

    public AuthServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User login(String email, String password) {
        currentUser = userService.loginByEmail(email, password); // UserService를 통해 로그인 처리
        return currentUser; // 로그인한 사용자 반환
    }

    @Override
    public void logout() {
        currentUser = null; // 현재 사용자 정보를 null로 설정하여 로그아웃 처리
    }

    @Override
    public void registerUser(User user) {
        userService.registerUser(user); // UserService를 통해 사용자 등록
    }

    @Override
    public boolean isAuthenticated() {
        return currentUser != null; // 현재 사용자가 인증된 상태인지 확인
    }

    @Override
    public User getCurrentUser() {
        return currentUser; // 현재 로그인한 사용자 정보 반환
    }
}