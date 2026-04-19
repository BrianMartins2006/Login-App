# Login App

Um aplicativo Android simples desenvolvido em Java que demonstra interações básicas de interface, transição entre telas (Activities) e a obtenção de dados e mídias usando a API **Activity Result**.

## 🚀 Funcionalidades

- **Autenticação Simulada:** Tela principal com campos de inserção de usuário e senha. O login exibe mensagens de erro ou de sucesso dependendo da entrada (usuário teste fixado no código).
- **Tela de Boas-Vindas:** Após o login bem-sucedido, dados via `Intent` são levados à próxima tela e formatados num *Snackbar*.
- **Integração de Câmera:** Na tela de boas-vindas, um botão aciona a intenção nativa de câmera para que o usuário possa tirar uma fotografia.
- **Activity Result Launcher:** A imagem capturada pela câmera é repassada como `Bitmap` por meio de `setResult()` e lida através de um contrato `ActivityResultLauncher` customizado na tela principal.
- **Design com Material Components:** Exposição da foto capturada de forma circular, retornando-a na tela principal e inserindo-a dinamicamente via `ShapeableImageView`.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **SDK:** Android SDK (Nível da API Mínima 30 / Target 36)
- **UI:** ConstraintLayout e Material Components para Android (`com.google.android.material`)

## 📱 Como executar o projeto

1. Tenha o [Android Studio](https://developer.android.com/studio) devidamente instalado.
2. Clone este repositório para o seu computador:
```bash
git clone git@github.com:BrianMartins2006/Login-App.git
```
3. Abra a pasta clonada no Android Studio.
4. Aguarde a sincronização completa do `Gradle`.
5. Selecione o dispositivo (Emulador ou Dispositivo Físico) e clique em **Run** (ou atalho `Shift + F10`).
6. O login teste nativo se faz pelas credenciais:
   - **Usuário:**  `emerson`
   - **Senha:** `admin`

## 📝 Controle de Versão

Este repositório foi recém iniciado e sincronizado ao GitHub para o rastreio das refatorações e aprendizados em volta da linguagem Java no ecossistema Android.
