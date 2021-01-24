
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuiGame {


    JFrame window;
    Container container;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, enemyPanel, placePanel, weaponPanel;
    JLabel titleNameLabel, heroNameLabel, placeNameLabel, placeLabelFunc, placeDifficultLabelNumber, placeDifficultFunc, heroNameFunc, heroHpLabel, enemyHpLabel, enemydamageNumber, enemyNameLabel, enemyNameFunc, enemydamageLabel, enemyHpNumber, heroDamageLabel, heroDamageLabelNumber, weaponDamageNumber, weaponDamageLevel, hpLabelNumber, weaponLabel, weaponLabelFunc;
    Font titleFont = new Font("Verdana", Font.BOLD, 40);
    Font normalText = new Font("Verdana", Font.PLAIN, 20);
    Font headings = new Font("Verdana", Font.PLAIN, 12);
    Font headingBold = new Font("Verdana", Font.BOLD, 13);

    JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9, choice10;
    JTextArea mainTextArea;
    int playerHP, silverRing;
    int monsterHP;
    String weapon, position, playerName, enemyName, placeName, weaponName;

    GuiGame.TitleScreenHandler tsHandler = new GuiGame.TitleScreenHandler();
    GuiGame.ChoiceHandler choiceHandler = new GuiGame.ChoiceHandler();

    public static void main(String[] args) {
        new GuiGame();
    }

    public GuiGame() {
        window = new JFrame();
        window.setSize(1000, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(300, 100, 400, 60);
        titleNamePanel.setBackground(Color.LIGHT_GRAY);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 80);
        startButtonPanel.setBackground(Color.DARK_GRAY);

        startButton = new JButton("START");
        startButton.setBackground(Color.ORANGE);
        startButton.setForeground(Color.white);
        startButton.setFont(normalText);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);


        container.add(titleNamePanel);
        container.add(startButtonPanel);


    }

    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 150, 800, 250);
        mainTextPanel.setBackground(Color.ORANGE);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 800, 250);
        mainTextArea.setBackground(Color.ORANGE);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalText);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(350, 405, 300, 250);
        choiceButtonPanel.setBackground(Color.DARK_GRAY);
        choiceButtonPanel.setLayout(new GridLayout(10, 1));
        container.add(choiceButtonPanel);


        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.LIGHT_GRAY);
        choice1.setForeground(Color.white);
        choice1.setFont(headings);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.LIGHT_GRAY);
        choice2.setForeground(Color.white);
        choice2.setFont(headings);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice 3");
        choice3.setBackground(Color.LIGHT_GRAY);
        choice3.setForeground(Color.white);
        choice3.setFont(headings);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice 4");
        choice4.setBackground(Color.LIGHT_GRAY);
        choice4.setForeground(Color.white);
        choice4.setFont(headings);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);


        choice5 = new JButton("choice 5");
        choice5.setBackground(Color.LIGHT_GRAY);
        choice5.setForeground(Color.white);
        choice5.setFont(headings);
        choice5.setFocusPainted(false);
        choice5.addActionListener(choiceHandler);
        choice5.setActionCommand("c5");
        choiceButtonPanel.add(choice5);

        choice6 = new JButton("choice 6");
        choice6.setBackground(Color.LIGHT_GRAY);
        choice6.setForeground(Color.white);
        choice6.setFont(headings);
        choice6.setFocusPainted(false);
        choice6.addActionListener(choiceHandler);
        choice6.setActionCommand("c6");
        choiceButtonPanel.add(choice6);

        choice7 = new JButton("choice 7");
        choice7.setBackground(Color.LIGHT_GRAY);
        choice7.setForeground(Color.white);
        choice7.setFont(headings);
        choice7.setFocusPainted(false);
        choice7.addActionListener(choiceHandler);
        choice7.setActionCommand("c7");
        choiceButtonPanel.add(choice7);

        choice8 = new JButton("choice 8");
        choice8.setBackground(Color.LIGHT_GRAY);
        choice8.setForeground(Color.white);
        choice8.setFont(headings);
        choice8.setFocusPainted(false);
        choice8.addActionListener(choiceHandler);
        choice8.setActionCommand("c8");
        choiceButtonPanel.add(choice8);

        choice9 = new JButton("choice 9");
        choice9.setBackground(Color.LIGHT_GRAY);
        choice9.setForeground(Color.white);
        choice9.setFont(headings);
        choice9.setFocusPainted(false);
        choice9.addActionListener(choiceHandler);
        choice9.setActionCommand("c9");
        choiceButtonPanel.add(choice9);

        choice10 = new JButton("choice 10");
        choice10.setBackground(Color.LIGHT_GRAY);
        choice10.setForeground(Color.white);
        choice10.setFont(headings);
        choice10.setFocusPainted(false);
        choice10.addActionListener(choiceHandler);
        choice10.setActionCommand("c10");
        choiceButtonPanel.add(choice10);
//===================Panels Location and creation=============
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 10, 800, 30);
        playerPanel.setBackground(Color.GRAY);
        playerPanel.setLayout(new GridLayout(1, 10));
        container.add(playerPanel);

        weaponPanel = new JPanel();
        weaponPanel.setBounds(100, 45, 800, 30);
        weaponPanel.setBackground(Color.GRAY);
        weaponPanel.setLayout(new GridLayout(1, 6));
        container.add(weaponPanel);

        enemyPanel = new JPanel();
        enemyPanel.setBounds(100, 80, 800, 30);
        enemyPanel.setBackground(Color.GRAY);
        enemyPanel.setLayout(new GridLayout(1, 6));
        container.add(enemyPanel);

        placePanel = new JPanel();
        placePanel.setBounds(100, 115, 800, 30);
        placePanel.setBackground(Color.GRAY);
        placePanel.setLayout(new GridLayout(1, 4));
        container.add(placePanel);
//        ===================Place's============
        placeNameLabel = new JLabel("Place's Name :");
        placeNameLabel.setFont(headingBold);
        placeNameLabel.setForeground(Color.white);
        placePanel.add(placeNameLabel);


        placeLabelFunc = new JLabel();
        placeLabelFunc.setFont(headings);
        placeLabelFunc.setForeground(Color.white);
        placePanel.add(placeLabelFunc);

        placeDifficultFunc = new JLabel("Place's Difficulty :");
        placeDifficultFunc.setFont(headingBold);
        placeDifficultFunc.setForeground(Color.white);
        placePanel.add(placeDifficultFunc);

        placeDifficultLabelNumber = new JLabel();
        placeDifficultLabelNumber.setFont(headings);
        placeDifficultLabelNumber.setForeground(Color.white);
        placePanel.add(placeDifficultLabelNumber);


//        ===================Enemy's============
        enemyNameLabel = new JLabel("Enemy's Name :");
        enemyNameLabel.setFont(headingBold);
        enemyNameLabel.setForeground(Color.white);
        enemyPanel.add(enemyNameLabel);


        enemyNameFunc = new JLabel();
        enemyNameFunc.setFont(headings);
        enemyNameFunc.setForeground(Color.white);
        enemyPanel.add(enemyNameFunc);

        enemyHpLabel = new JLabel("Enemy's HP :");
        enemyHpLabel.setFont(headingBold);
        enemyHpLabel.setForeground(Color.white);
        enemyPanel.add(enemyHpLabel);


        enemyHpNumber = new JLabel();
        enemyHpNumber.setFont(headings);
        enemyHpNumber.setForeground(Color.white);
        enemyPanel.add(enemyHpNumber);

        enemydamageLabel = new JLabel("Enemy's Damage :");
        enemydamageLabel.setFont(headingBold);
        enemydamageLabel.setForeground(Color.white);
        enemyPanel.add(enemydamageLabel);

        enemydamageNumber = new JLabel();
        enemydamageNumber.setFont(headings);
        enemydamageNumber.setForeground(Color.white);
        enemyPanel.add(enemydamageNumber);


//        ===================Heros============

        heroNameLabel = new JLabel("Hero's Name :");
        heroNameLabel.setFont(headingBold);
        heroNameLabel.setForeground(Color.white);
        playerPanel.add(heroNameLabel);


        heroNameFunc = new JLabel();
        heroNameFunc.setFont(headings);
        heroNameFunc.setForeground(Color.white);
        playerPanel.add(heroNameFunc);

        heroHpLabel = new JLabel("Hero's HP :");
        heroHpLabel.setFont(headingBold);
        heroHpLabel.setForeground(Color.white);
        playerPanel.add(heroHpLabel);


        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(headings);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        heroDamageLabel = new JLabel("Damage :");
        heroDamageLabel.setFont(headingBold);
        heroDamageLabel.setForeground(Color.white);
        playerPanel.add(heroDamageLabel);

        heroDamageLabelNumber = new JLabel();
        heroDamageLabelNumber.setFont(headings);
        heroDamageLabelNumber.setForeground(Color.white);
        playerPanel.add(heroDamageLabelNumber);

//==================Weapon's=====================

        weaponLabel = new JLabel("Weapon :");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(headingBold);
        weaponPanel.add(weaponLabel);

        weaponLabelFunc = new JLabel();
        weaponLabelFunc.setFont(headings);
        weaponLabelFunc.setForeground(Color.white);
        weaponPanel.add(weaponLabelFunc);

        weaponDamageLevel = new JLabel("Damage :");
        weaponDamageLevel.setFont(headingBold);
        weaponDamageLevel.setForeground(Color.white);
        weaponPanel.add(weaponDamageLevel);

        weaponDamageNumber = new JLabel();
        weaponDamageNumber.setFont(headings);
        weaponDamageNumber.setForeground(Color.white);
        weaponPanel.add(weaponDamageNumber);

        heroSelection();

    }

    public void heroSelection() {
        position = "hero selection";
        System.out.println("You must select at the beginning to your hero.");
        mainTextArea.setText("You must select at the beginning to your hero. Choice one of the following options?");
        choice1.setText("Aragorn");
        choice2.setText("Gimli");
        choice3.setText("Legolas");
        choice4.setText("Frodo");
        choice5.setText("Mithrandir");
        choice6.setText("Strider");
        choice7.setText("Gandalf the Gray");
        choice8.setText("Gandalf the White");
        choice9.setText("Elrond");
        choice10.setText("Galadriel");
        playerSetup();
    }

    public void playerSetup() {
        heroNameFunc.setText("Hero name");
        hpLabelNumber.setText("" + playerHP);
        heroDamageLabelNumber.setText("heros damage");
        weaponLabelFunc.setText("Weapon name");
        weaponDamageNumber.setText("Weapon damage number");
        placeDifficultFunc.setText("Place name");
        placeDifficultLabelNumber.setText("Place diff number");
        enemyNameFunc.setText("Enemy name");
        enemydamageNumber.setText("Enemy damage level");
        enemyHpNumber.setText("hp level");

    }

    public void shire() {
        position = "Shire";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("Caradras");
        choice2.setText("Moria");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }
    public void caradras() {
        position = "Caradras";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("shire");
        choice2.setText("moria");
        choice3.setText("rivendel");
        choice4.setText("rohan");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void moria() {
        position = "Moria";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("Caradras");
        choice2.setText("shire");
        choice3.setText("rivendel");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void rivendel() {
        position = "Rivendel";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("Caradras");
        choice2.setText("Moria");
        choice3.setText("rohan");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void rohan() {
        position = "Rohan";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("Caradras");
        choice2.setText("Moria");
        choice3.setText("rivendel");
        choice4.setText("helmsdeep");
        choice5.setText("minastrith");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void helmsDeep() {
        position = "Helm Deep";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("rohan");
        choice2.setText("minastrith");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }
    public void minastrith() {
        position = "Minastrith";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the Shire\n" +
                "What do you want to do?");

        enemyEncounter();
        choice1.setText("rohan");
        choice2.setText("helmsdeep");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello Stranger. I have seen you here.\n\n" +
                "I'm sorry but we cannot let a stranger enter our town");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
        choice9.setText("");
        choice10.setText("");
    }

    public void enemyEncounter() {

    }

    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Hey don't be stupid\n\n" +
                "The guard fought back and hit you hard\n(you receive 3 damage");
        playerHP -= 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Back");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void crossRoad() {
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad\nIf you go South, you will go back to the town");
        choice1.setText("Go South");
        choice2.setText("Go North");
        choice3.setText("Go East");
        choice4.setText("Go West");
    }

    public void north() {
        position = "north";
        mainTextArea.setText("There is a river. You drink the water at the riverside. (Your HP is recovered by:2)");
        playerHP += 2;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Go South");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void west() {
        position = "west";
        mainTextArea.setText("You encounter a goblin!");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }

    public void east() {
        position = "east";
        mainTextArea.setText("You walked into a forest and found a Long Sword!\n(You obtained a Long Sword");
        weapon = "Long Sword";
        weaponLabelFunc.setText(weapon);
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void fight() {
        position = "fight";
        mainTextArea.setText("Monster HP :" + monsterHP + "\n\nWhat do yo do?");
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");

    }

    public void attack() {
        position = "attack";
        int playerDamage = 0;

        if (weapon.equals("Knife")) {
            playerDamage = new Random().nextInt(3);
        } else if (weapon.equals("Long Sword")) {
            playerDamage = new Random().nextInt(10);
        }
        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!");
        monsterHP -= playerDamage;
        choice1.setText("Monster attack");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void monsterAttack() {
        position = "monsterAttack";
        int monsterDamage = 0;
        monsterDamage = new Random().nextInt(6);
        mainTextArea.setText("Monster attacked to you and gave " + monsterDamage + " damage");
        playerHP -= monsterDamage;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }

    public void win() {
        position = "win";
        mainTextArea.setText("You defeated monster\nYou obtained a Silver Ring.");
        silverRing++;
        choice1.setText("Go east");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void lose() {
        position = "lose";
        mainTextArea.setText("You are dead!\n ####GAME OVER####");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void ending() {
        position = "ending";
        mainTextArea.setText("Guard: you killed that goblin!? wellcome to our town.");
    }

    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            System.out.println(yourChoice);
            System.out.println(position + " before");
            switch (position) {
                case "townGate":
                    System.out.println(position + " after");
                    System.out.println(yourChoice);
                    switch (yourChoice) {
                        case "c1" -> {
                            if (silverRing > 1) {
                                ending();
                            } else {
                                talkGuard();
                            }
                        }

                        case "c2" -> attackGuard();
                        case "c3" -> crossRoad();
                    }
                    break;
                case "talkGuard":
                    switch (yourChoice) {
                        case "c1" -> shire();
                    }
                    break;
                case "attackGuard":
                    switch (yourChoice) {
                        case "c1":
                            shire();
                            break;
                    }
                    break;
                case "crossRoad":
                    switch (yourChoice) {
                        case "c1":
                            shire();
                            break;
                        case "c2":
                            north();
                            break;
                        case "c3":
                            east();
                            break;
                        case "c4":
                            west();
                            break;
                    }
                    break;
                case "north":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
                case "east":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
                case "west":
                    switch (yourChoice) {
                        case "c1":
                            fight();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "fight":
                    switch (yourChoice) {
                        case "c1":

                            attack();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "attack":
                    switch (yourChoice) {
                        case "c1":
                            if (monsterHP < 1) {
                                win();
                            } else {
                                monsterAttack();
                            }
                            break;
                    }
                    break;
                case "monsterAttack":
                    switch (yourChoice) {
                        case "c1":
                            if (playerHP < 1) {
                                lose();
                            } else {
                                fight();
                            }
                            break;
                        case "c2":
                            shire();
                            break;
                    }
                    break;
                case "win":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
            }
        }
    }
}



