package com.alessandroreis.java.recyclerviewjava.model;

import java.util.Arrays;
import java.util.List;

public class Emails {

    public static List<Email> fakeEmails() {
        return Arrays.asList(
                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja as nossas três dicas")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua pagina")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Veja nossas três diasc principais para você conseguir")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("18 mai")
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas três diasc principais para você conseguir")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua pagina")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Veja nossas três diasc principais para você conseguir")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("18 mai")
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja as nossas três dicas")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua pagina")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Veja nossas três diasc principais para você conseguir")
                        .setPreview("Olá Tiago, você precisa ver esse site para")
                        .setDate("18 mai")
                        .setStared(false)
                        .build()

        );
    }
}
