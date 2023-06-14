package com.web.community.service;

import com.web.community.domain.Board;
import com.web.community.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor// 생성자
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public Page<Board> finalBoardList(Pageable pageable){
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0: pageable.getPageNumber()-1 , pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }

    public Board findBoardByIdx(Long idx){
        return boardRepository.findById(idx).orElse(new Board());
    }

}
