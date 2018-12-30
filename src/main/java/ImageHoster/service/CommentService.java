package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments(Integer imageId){
        List<Comment> result= commentRepository.getAllComments(imageId);
        return result;
    }



    public Comment updateComment(Comment comment){
        return commentRepository.updateComment(comment);
    }
}
