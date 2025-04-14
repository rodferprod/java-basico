public class App {
    public static void main(String[] args) throws Exception {
        HoraBR relogioBR = new HoraBR();
        HoraUSA relogioUS = new HoraUSA();

        relogioUS.setHora(9);
        relogioUS.setMinuto(30);
        relogioUS.setSegundo(34);
        relogioUS.setIndicadorPeriodo("AM");

        System.out.println(relogioUS.getHorario());

        relogioBR.converter(relogioUS);

        System.out.println(relogioBR.getHorario());

        relogioBR.setHora(13);
        relogioBR.setMinuto(35);
        relogioBR.setSegundo(54);

        System.out.println(relogioBR.getHorario());

        relogioUS.converter(relogioBR);

        System.out.println(relogioUS.getHorario());

    }
}
