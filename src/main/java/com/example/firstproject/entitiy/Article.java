package com.example.firstproject.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체를 인식 가능
@AllArgsConstructor // 매개변수 생섯ㅇ자
@NoArgsConstructor  // 기본 생성자
@ToString   // toString 오버라이드
@Getter
public class Article {

    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue // 1, 2, 3, .. 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
