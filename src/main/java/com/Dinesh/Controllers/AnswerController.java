package com.Dinesh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Dinesh.Dao.AnswerDao;
import com.Dinesh.Dao.QuestionDao;
import com.Dinesh.Dao.QuizDao;
import com.Dinesh.Models.Answer;
import com.Dinesh.Models.Question;
import com.Dinesh.Models.Quiz;

@Controller
@RequestMapping("/answer")
public class AnswerController {
		
	@Autowired
	private AnswerDao adoa;
	
	@Autowired
	private QuestionDao quesdao;
	
	@Autowired
	private QuizDao qdao;
	
	@RequestMapping("/viewans")
	public String view_answerw(@RequestParam("quesid")int id,Model model) {
		model.addAttribute("question", quesdao.get_question(id));
		model.addAttribute("ans", adoa.getans(id));
		return "viewans";
	}
	
	@RequestMapping("/addans")
	public String add_answer(@RequestParam("quesid")int id,Model model) {
		
		Question question = quesdao.get_question(id);
		
		Answer ans = new Answer();
		ans.setQuesid(question.getId());
		model.addAttribute("answer", ans);
		
		return "addans";
		
		
		
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("answer")Answer answer,RedirectAttributes attributes) {
		
		int result = adoa.save_question(answer);
		
		Question que = quesdao.get_question(answer.getQuesid());
		
		Quiz quiz = qdao.get_quiz(que.getQid());
		
		attributes.addAttribute("quizid", quiz.getId());
		
		return "redirect:/home/question";
		 
	}
}
