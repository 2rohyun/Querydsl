package study.queydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.queydsl.dto.MemberSearchCondition;
import study.queydsl.dto.MemberTeamDto;
import study.queydsl.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

    List<Member> searchMember(MemberSearchCondition condition);

    Page<MemberTeamDto> searchSimple(MemberSearchCondition condition, Pageable pageable);

    Page<MemberTeamDto> searchComplex(MemberSearchCondition condition, Pageable pageable);
}
