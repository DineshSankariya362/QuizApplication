package com.Dinesh.Controllers;

import java.util.List;

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
@RequestMapping("/home")
public class MyController {

	@Autowired
	private QuizDao qdao;

	@Autowired
	private QuestionDao quesdao;

	@Autowired
	private AnswerDao adoa;

	@RequestMapping("/quiz")
	public String qpage(Model model) {
		model.addAttribute("quiz", qdao.getallquiz());
		return "quiz";
	}

	@RequestMapping("/uquiz")
	public String update_quiz(@RequestParam("quizid") int id, Model model) {

		model.addAttribute("quiz", qdao.get_quiz(id));
		return "editquiz";

	}

	@RequestMapping("/quizform")
	public String quiz_form(Model model) {
		model.addAttribute("quiz", new Quiz());
		return "addquiz";
	}

	@RequestMapping("/savequiz")
	public String save_quiz(@ModelAttribute("quiz") Quiz quiz) {
		int result = qdao.save_quiz(quiz);

		if (result != 0) {

			return "redirect:/home/quiz";
		}

		return "redirect:/home/quizform";
	}

	@RequestMapping("/editsave")
	public String edit_save_quiz(@ModelAttribute("quiz") Quiz quiz, Model model) {

		int result = qdao.update_quiz(quiz);

		if (result != 0) {
			return "redirect:/home/quiz";
		}

		model.addAttribute("quiz", qdao.get_quiz(quiz.getId()));
		return "editquiz";

	}

	@RequestMapping("/delquiz")
	public String delete_quiz(@RequestParam("quizid") int id) {

		List<Question> que = quesdao.getquestion(id);
		
		if(que.size()>0) {
			for (Question question : que) {
				int r = adoa.delete_ans(question.getId());
				
			}
			
			List<Answer> ans = adoa.getans(que.get(0).getId());
			
			int qres = quesdao.delete_questions(que.get(0).getQid());
		}
		
//		
		

		int result = qdao.delete_quiz(id);

		return "redirect:/home/quiz";

	}

	
//		int result = qdao.delete_quiz(id);
//		
//		if(result!=0) {
//			return "redirect:/home/quiz";
//		}

	

	@RequestMapping("/addques")
	public String add_question(@RequestParam("quizid")int id, Model model) {
		
		Quiz quiz = qdao.get_quiz(id);
		Question que = new Question();
		que.setQid(quiz.getId());
		model.addAttribute("question", que);
		return "addques";
		
	}

	@RequestMapping("/saveques")
	public String save_ques(@ModelAttribute("question")Question que,RedirectAttributes attributes) {
		int result = quesdao.save_question(que);
		attributes.addAttribute("quizid",que.getQid());
		if(result!=0) {
			
			return "redirect:/home/question";
		}
		
		return "redirect:/home/addques";
	}

	@RequestMapping("/question")
	public String questions(@RequestParam("quizid")int id,Model model) {
		List<Question> questions = quesdao.getquestion(id);
//		System.out.println(questions.size());
		model.addAttribute("question", questions);
		if(questions.size()>0) {
			return "quiz_question";
		}
		
		return "redirect:/home/quiz";
		
	}

	@RequestMapping("/uques")
	public String update_question(@RequestParam("quesid")int id,Model model) {
		
		Question question = quesdao.get_question(id);
		model.addAttribute("question", question);
		return "editques";
		
		
	}

	@RequestMapping("/editsaveques")
	public String edit_save_question(@ModelAttribute("question")Question question) {
		
		int result = quesdao.update_question(question);
		
		if(result!=0) {
			return "redirect:/home/question?quizid="+question.getQid();
		}
		
		return "redirect:/home/uques?quesid="+question.getId();
	}

	@RequestMapping("/delques")
	public String delete_ques(@RequestParam("quesid")int id,RedirectAttributes attributes) {
		
		
		adoa.delete_ans(id);
		int result = quesdao.delete_question(id);
		attributes.addAttribute("quizid",id);
		return "redirect:/home/question";
		
		
		
	}

}
