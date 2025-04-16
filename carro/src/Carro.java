public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;
    private boolean acelerando = false;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já estava ligado!");
            return;
        }
        this.ligado = true;
        System.out.println("Você ligou o carro.");
    }

    public void desligar() {
        if (!this.ligado) {
            System.out.println("O carro não está ligado.");
            return;
        }
        if (this.marcha > 0 || this.velocidade > 0) {
            System.out.printf(
                    "O carro precisa estar parado (atualmente à %skm) e em marcha neutra (atualmente na %sª marcha) para poder ser desligado.\n",
                    this.velocidade, this.marcha);
            return;
        }
        this.ligado = false;
        System.out.println("Você desligou o carro.");
    }

    public void acelerar() {
        this.acelerando = true;
        if (!checarIgnicao())
            return;
        if (!verificarVelocidadeMarcha())
            return;
        this.velocidade++;
        mostrarVelocidade();
    }

    public void desacelerar() {
        this.acelerando = false;
        if (!checarIgnicao())
            return;
        if (this.velocidade > 0)
            this.velocidade--;
        if (!verificarVelocidadeMarcha())
            return;
        mostrarVelocidade();
    }

    public void virarDireita() {
        if (!checarIgnicao())
            return;
        if (!checarVelocidadeManobra())
            return;
        System.out.println("O carro virou à direita.");
    }

    public void virarEsquerda() {
        if (!checarIgnicao())
            return;
        if (!checarVelocidadeManobra())
            return;
        System.out.println("O carro virou à esquerda.");
    }

    public void aumentarMarcha() {
        if (!checarIgnicao())
            return;
        if (this.marcha < 6)
            this.marcha++;
        if (!verificarVelocidadeMarcha())
            return;
        mostrarMarcha();
    }

    public void diminuirMarcha() {
        if (!checarIgnicao())
            return;
        if (this.marcha > 0)
            this.marcha--;
        if (!verificarVelocidadeMarcha())
            return;
        mostrarMarcha();
    }

    private void mostrarMarcha() {
        if (this.marcha == 0)
            System.out.println("O carro está no neutro.");
        else
            System.out.printf("O carro está na %sª marcha.\n", this.marcha);
    }

    private boolean checarIgnicao() {
        if (this.ligado == false) {
            System.out.println("O carro está desligado.");
        }
        return this.ligado;
    }

    private void mostrarVelocidade() {
        System.out.printf("O carro está a %skm de velocidade.\n", this.velocidade);
    }

    private boolean checarVelocidadeManobra() {
        if (this.velocidade == 0) {
            System.out.println("O carro está parado e não pode manobrar.");
            return false;
        }
        if (this.velocidade > 40) {
            System.out.printf("Diminua a velocidade para poder manobrar. O carro está a %skm no momento.\n",
                    this.velocidade);
            return false;
        }
        return true;
    }

    private boolean verificarVelocidadeMarcha() {
        System.out.println();
        switch (this.marcha) {
            case 0:
                if (this.acelerando) {
                    System.out.println("Engrene o carro para iniciar a aceleração!");
                    this.acelerando = false;
                    return false;
                }
                return true;
            case 1:
                if (this.velocidade == 20 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade == 0 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
                return true;
            case 2:
                if (this.velocidade == 40 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade <= 21 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
                return true;
            case 3:
                if (this.velocidade == 60 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade <= 41 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
                return true;
            case 4:
                if (this.velocidade == 80 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade <= 61 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
            case 5:
                if (this.velocidade == 100 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade <= 81 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
            case 6:
                if (this.velocidade == 120 && this.acelerando) {
                    avisoVelocidadeMaximaDaMarcha();
                    return false;
                }
                if (this.velocidade <= 101 && !this.acelerando) {
                    avisoVelocidadeMínimaDaMarcha();
                    return false;
                }
                return true;
            default:
                System.out.println("Marcha inválida para este carro!");
                return false;
        }
    }

    private void avisoVelocidadeMaximaDaMarcha() {
        if (this.marcha == 6) {
            System.out.printf("O carro chegou em sua velocidade máxima (%skm)!\nDiminua a velocidade!\n",
                    this.velocidade);
        } else {
            System.out.printf(
                    "O carro está à %skm, sendo a velocidade máxima da %sª marcha!\nDesacelere para poder passar para a %sª marcha!\n",
                    this.velocidade, this.marcha, this.marcha + 1);
        }
    }

    private void avisoVelocidadeMínimaDaMarcha() {
        if (this.velocidade == 0 && this.marcha > 0) {
            System.out.println("O carro está parado. Coloque a marcha no neutro.");
            return;
        } else {
            System.out.printf(
                    "O carro está à %skm, sendo a velocidade mínima da %sª marcha!\nRedusa para a %sª marcha!\n",
                    this.velocidade, this.marcha, this.marcha - 1);
        }
        this.velocidade++;
        this.acelerando = true;
    }
}