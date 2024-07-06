package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // save를 통해 member를 저장소에 저장
    Optional<Member> findById(Long id); // optional은 null이 반환 될 때 null을 그대로 반환하기보다는 Optional로 감싸서 반환한다.
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 저장된 모든 회원 리스트 반환
}
