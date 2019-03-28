package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShowHand {

	private final int PLAY_NUM = 5;
	private String[] types = { "黑桃 ", "梅花 ", "红心 ", "方块 " };
	private String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private List<String> cards = new LinkedList<String>();
	private String[] players = new String[PLAY_NUM];
	private List<String>[] playersCards = new List[PLAY_NUM];

	// 初始化扑克牌
	public void initcards() {
		for (int i = 0; i < types.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards.add(types[i] + values[j]);
			}
		}
		Collections.shuffle(cards);
	}

	// 初始化玩家
	public void initplayers(String... names) {
		if (names.length > PLAY_NUM || names.length < 2) {
			System.out.println("玩家数量不对！");
			return;
		} else {
			for (int i = 0; i < names.length; i++) {
				players[i] = names[i];
			}
		}

	}

	// 初始化玩家手牌
	public void initplayCards() {
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null && !players[i].equals("")) {
				playersCards[i] = new LinkedList<String>();
			}
		}
	}

	// 输出全部扑克牌
	public void showAllCards() {
		for (String card : cards) {
			System.out.println(card);
		}
	}

	public int find(String[] all, String target) {
		if (target == null)
			return -1;
		for (int i = 0; i < all.length; ++i) {
			if (all[i].equals(target))
				return i;
		}
		return -1;
	}

	// 派扑克牌
	public void deliverCard(String first) {

		int firstPos = find(players, first);
		for (int i = firstPos; i < PLAY_NUM; i++) {
			if (players[i] != null) {
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}

		for (int i = 0; i < firstPos; i++) {
			if (players[i] != null) {
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}

	// 输出玩家的手牌
	public void showPlayerCards() {
		for (int i = 0; i < PLAY_NUM; i++) {
			if (players[i] != null) {
				System.out.println(players[i] + ": ");
				for (String card : playersCards[i]) {
					System.out.println(card + "\t");
				}
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		ShowHand sh = new ShowHand();
		sh.initplayers("电脑玩家", "孙悟空");
		sh.initcards();
		sh.initplayCards();
		System.out.println("-------------------");
		sh.deliverCard("孙悟空");
		sh.showPlayerCards();
		sh.deliverCard("电脑玩家");
		sh.showPlayerCards();

	}

}
