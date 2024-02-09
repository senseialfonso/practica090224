/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author alfon
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario= new Usuario("limon");
        Video video = new Video("aprendiendo java",2400,"http;//limon.co");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
