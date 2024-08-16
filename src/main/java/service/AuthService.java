package service;

import entity.User;

public interface AuthService {
    User login(String email, String password); // 로그인 메서드
    void logout(); // 로그아웃 메서드
    void registerUser(User user); // 사용자 등록 메서드
    boolean isAuthenticated(); // 인증 상태 확인 메서드
    User getCurrentUser(); // 현재 사용자 정보 조회 메서드
}