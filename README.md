# Login App

Um aplicativo Android simples desenvolvido em Java que demonstra interações básicas de interface, transição entre telas (Activities) e a obtenção de dados e mídias usando a API **Activity Result**.

## 🚀 Funcionalidades

- **Autenticação Simulada:** Tela principal com campos de inserção de usuário e senha. O login exibe mensagens de erro ou de sucesso dependendo da entrada (usuário teste fixado no código).
- **Tela de Boas-Vindas:** Após o login bem-sucedido, dados via `Intent` são levados à próxima tela e formatados num *Snackbar*.
- **Integração de Câmera:** Na tela de boas-vindas, um botão aciona a intenção nativa de câmera para que o usuário possa tirar uma fotografia.
- **Activity Result Launcher:** A imagem capturada pela câmera é repassada como `Bitmap` por meio de `setResult()` e lida através de um contrato `ActivityResultLauncher` customizado na tela principal.
- **Design com Material Components:** Exposição da foto capturada de forma circular, retornando-a na tela principal e inserindo-a dinamicamente via `ShapeableImageView`.

