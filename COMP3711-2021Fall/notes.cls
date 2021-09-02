\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{notes}
\LoadClass{article}

\RequirePackage{amsmath}
\RequirePackage{mathrsfs}
\RequirePackage{amsthm}
\RequirePackage{enumerate}
\RequirePackage{color}
\RequirePackage{graphicx}
\RequirePackage{ifthen}
\RequirePackage{wrapfig}

\newcommand{\todo}[1]{\textcolor{blue}{#1}}

\newcommand{\subtitle}[1]{\def\@subtitle{#1}}

\AtBeginDocument{%
    \@MakeTitle[\@subtitle]{\@title}%
      \vskip .5em
  }%

\ProcessOptions


\font\dunhd=cmdunh10 scaled \magstep5
\font\dunhc=cmdunh10 scaled \magstep4
\font\dunhb=cmdunh10 scaled \magstep3
\font\dunha=cmdunh10 scaled \magstep2

\newcommand{\@MakeTitle}[2][]{%
  \hrule height6pt \vspace{-0.5em}%
  \noindent%
  \renewcommand\arraystretch{2.5}
  \begin{tabular}{lr}
    {\huge \coursenumber} \qquad
    {\huge \coursesemester} \hspace{0in}\\
    {\Huge \coursename}  \hspace{0in}\\
    {\Large Written By: \author}
  \end{tabular}
  % \parbox[b]{0.42\textwidth}{
  %   {\dunhb \coursenumber}\qquad %
  %   {\dunhb \coursesemester}}\\%
  % \parbox[b]{0.42\textwidth}{%
  %   \raggedright
  %   {\dunhb \coursename}}%
  % \hfill%
  % \begin{tabular}[b]{l}
  %   \ifthenelse{\equal{#1}{}}{%
  %     {\dunhd #2}%
  %   }{%
  %     {\dunhb #2}\\%
  %     {\dunhb #1}%
  %   }
  % \end{tabular}%
  \vskip 0.6em
  \hrule height6pt
  \par
  \vskip .5em
  \begin{center}
    {\huge {#2}\hspace{2em} \textbf{#1}}
  \end{center}
}

\newcommand{\pad}{\vspace*{\fill}\par}
\def\indep{\perp\!\!\!\perp}
\newcommand{\disp}{\displaystyle}
\newcommand{\rar}{\rightarrow}
\newcommand{\lar}{\leftarrow}
\newcommand{\blue}{\color{blue}}
\newcommand{\green}{\color{green}}
\newcommand{\red}{\color{red}}


\textwidth = 7.0 in
\textheight = 9.5 in
\oddsidemargin = -0.30 in
\evensidemargin = -0.30 in
\topmargin = -0.75 in
\headheight = 0.00 in
\headsep = 0.25 in
\parskip = 0.15in
\parindent = 0.0in
\itemsep=-1pt
\floatsep 5pt plus 2pt minus 3pt
\intextsep 5pt plus 2pt minus 3pt
\textfloatsep=5pt plus 2pt minus 3pt
\renewcommand{\baselinestretch}{1.0}
\font\dunhd=cmdunh10 scaled \magstep5
\font\dunhc=cmdunh10 scaled \magstep4
\font\dunhb=cmdunh10 scaled \magstep3
\font\dunha=cmdunh10 scaled \magstep2
\date{}