package com.bc.web_project.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bc.web_project.dao.QnADAO;
import com.bc.web_project.vo.AnswerVO;
import com.bc.web_project.vo.QuestionVO;

//do 없어도 되고

@RestController  //???
@RequestMapping("/QnA/*")  //QnA 안에 있는 모든 것을 받아온다?
public class Q_list {
	
	@Inject
	QnADAO QnADao;
	
	//main 질문리스트 //USERS TABLE join
	//이건왜 do 안써도 되남?
	@RequestMapping(value="QnA", method=RequestMethod.GET)
	public ModelAndView QnA() {
		ModelAndView model = new ModelAndView();
		
		List<QuestionVO> questionList = QnADao.QnAselect();
		
		model.addObject("questionList", questionList);  
		model.setViewName("QnA/QnA");
		
		return model;
	}
	
	//QUESTION 테이블의 num으로 질문, 답변 상세 보기
	@RequestMapping(value="DetailQnA/{num}", method=RequestMethod.GET)
	public ModelAndView DetailQnA(@PathVariable int num) {  //@RequestParam(defaultValue="0")?
		System.out.println(num);
		ModelAndView model = new ModelAndView();
		
		QuestionVO questionVO = QnADao.detail(num);
		AnswerVO answerVO = QnADao.answerSelect(num);
		
		model.addObject("answerVO", answerVO);
		model.addObject("questionVO", questionVO);  
		model.setViewName("QnA/DetailQnA");
		
		return model;
	}
	
	//QUESTION 테이블의 num으로 답변 상세 보기
	/*@RequestMapping(value="DetailQnA/{num}/answer", method=RequestMethod.GET)
	public ModelAndView answerSelect(@PathVariable int num) {
		ModelAndView model = new ModelAndView();
		
		AnswerVO answerVO = QnADao.answerSelect(num);
		
		model.addObject("answerVO", answerVO);
		model.setViewName("QnA/DetailQnA");
		
		return model;
	}*/
	
	
	//질문하기 modal로 글쓰면 게시판 생기면서 리스트 출력, 제목,내용,태그 입력하고, 생성날짜, 그리고 로그인한 유저네임 등록.
	@RequestMapping(value="insertQuestion", method=RequestMethod.POST)
	public ModelAndView insertQuestion(QuestionVO questionVO) {
		ModelAndView model = new ModelAndView();
		int insert = 0;
		insert = QnADao.insertQuestion(questionVO);
		
		if(insert>0) {
			model.setViewName("redirect:QnA/QnA");
			//model.setViewName("QnA/QnA");
		}else {
			model.setViewName("redirect:QnA/DetailQnA"+questionVO.getNum());
		}
		return model;
	}
	
	
	//답변 카운트
	/*@RequestMapping(value="AnswerCount/{num}", method=RequestMethod.GET)
	public ModelAndView AnswerCount(@PathVariable int num) {
		ModelAndView model = new ModelAndView();
		AnswerVO answerVO = QnADao.answerCount(num);
		List<QuestionVO> questionList = QnADao.QnAselect();
		
		model.addObject("questionList", questionList);
		model.addObject("answerVO", answerVO);
		model.setViewName("QnA/QnA");
		
		return model;
	}*/
	
}




















