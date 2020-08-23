/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
import model.entities.PostModel;

/**
 *
 * @author Bruno Araujo
 */
public class Java_S13e2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PostModel postModel = new PostModel();
        
        System.out.println("Título do post: ");
        String title = new Scanner(System.in).nextLine();
        
        System.out.println("Cinteúdo do post: ");
        String content = new Scanner(System.in).nextLine();
        
        System.out.println("Quantidade de likes: ");
        long likes = Long.parseLong(new Scanner(System.in).nextLine());
        
        boolean isCommenting = true;
        System.out.println("Deseja fazer algum comentário no post? S/N");
        String answer = new Scanner(System.in).nextLine();
        if(answer.equals("S")){
            isCommenting = true;
        } else if(answer.equals("N")){
            isCommenting = false;
        } else {
            System.out.println("Digite apenas S ou N - Sim ou Não: ");
        }
        
        System.out.println("Comentário: ");
        String comment = new Scanner(System.in).nextLine();
        
        
    }
    
}
