# Organizador Diário – gerar o APK no GitHub

## Passo a passo
1. Crie uma conta em github.com e clique em **New repository**. Dê um nome (ex.: `organizador-diario`) e marque **Private**.
2. Envie **todos os arquivos desta pasta** para o repositório, sem a pasta de fora:
   `www/`, `assets/`, `signing/`, `.github/`, `package.json`, `capacitor.config.json`, `.gitignore`.
   (No computador: botão **Add file → Upload files** e arraste o conteúdo. Se a pasta oculta `.github` não subir,
   use **Add file → Create new file**, digite o nome `.github/workflows/build-apk.yml` e cole o conteúdo do arquivo.)
3. Abra a aba **Actions**. O trabalho **Gerar APK** roda sozinho (leva uns 5 a 10 minutos).
   Se não rodar, clique em **Gerar APK → Run workflow**.
4. Quando terminar (✔ verde), abra a execução e, no fim da página, em **Artifacts**, baixe **organizador-diario-apk**.
5. Descompacte o .zip baixado e instale o `organizador-diario.apk` no celular
   (permita "instalar apps desconhecidos" quando o Android pedir).

## Importante
- **Mantenha o repositório privado.** A pasta `signing/` tem a chave que assina o app. Com ela fixa,
  as próximas versões atualizam o app **sem apagar as fotos**. Não troque nem apague esse arquivo.
- As fotos ficam só no celular, dentro do app. **Desinstalar o app apaga tudo.** As fotos que estão no Chrome
  não passam para o APK.
- Para atualizar o app: troque `www/index.html` no GitHub e faça commit. O APK novo é gerado sozinho.

## Atualizar o app depois
Para mudanças só no visual ou nas funções, troque apenas `www/index.html`.
Nas atualizações que também mexem na barra de status do celular (como a de 24/10), troque **todos** os arquivos do zip:
`www/index.html`, `package.json`, `capacitor.config.json` e `.github/workflows/build-apk.yml`.

## Pasta android-extra
Contém 2 arquivos em Java (`MainActivity.java` e `NavBarPlugin.java`) que pintam a barra de navegação do Android
com a cor da tarja. Envie a pasta inteira ao GitHub, junto com os outros arquivos.
