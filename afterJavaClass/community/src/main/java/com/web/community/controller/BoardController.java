package com.web.community.controller;

import com.web.community.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")// 시작시
public class BoardController {
    private final BoardService boardService;

    //전체 리스트
    @GetMapping("/list")
    public String boardlist(@PageableDefault Pageable pageable, Model model){
        model.addAttribute("boardList", boardService.finalBoardList(pageable));
        return "/board/list";
    }

    @GetMapping({"/", ""})
    public String board(@RequestParam Long idx, Model model){
        model.addAttribute("board", boardService.findBoardByIdx(idx));
        return"/board/form";
    }

}
