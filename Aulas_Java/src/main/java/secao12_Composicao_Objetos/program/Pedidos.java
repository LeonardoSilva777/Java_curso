package secao12_Composicao_Objetos.program;

import secao12_Composicao_Objetos.entities.Order;
import secao12_Composicao_Objetos.entities.OrderStatus;

import java.util.Date;

public class Pedidos {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED; //Instanciou um objeto do tipo OrderStatus

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

        //Retorno com e sem To Sting:
        //Order{id=1080, moment=Sun Nov 01 01:12:45 BRT 2026, status=PENDING_PAYMENT}
        //secao12_Composicao_Objetos.entities.Order@3feba861

        /*por padrão o status fica com o nome igual ao que foi instanciado na classe
        * enum do OrderStatus. utilizando dentro da classe Order onde criamos ali
        * o nosso objeto com o id, momento e status do pedido colocamos um to String
        * para que o retorno do nosso sout ficasse com esse padrão dentro das {}*/
    }
}
