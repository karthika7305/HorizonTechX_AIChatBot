import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("   🤖 AI CHATBOT STARTED");
        System.out.println("   Type 'bye' to exit");
        System.out.println("==========================\n");
        while (true) {
            System.out.print("You: ");
            String user = sc.nextLine().toLowerCase();
            if (user.contains("bye") || user.contains("exit")) {
                System.out.println("ChatBot: 👋 Goodbye! It was great talking with you. Have a wonderful day 😊");
                break;
            }
            else if (user.contains("hi") || user.contains("hello")) {
                System.out.println("ChatBot:Hello! Nice to meet you 😊 How can I help you today?");
            }
            else if (user.contains("java")) {
                System.out.println("ChatBot:Java is a powerful programming language used for web, mobile and enterprise applications.");
            }
            else if (user.contains("python")) {
                System.out.println("ChatBot:Python is simple, powerful and widely used in AI, data science and automation.");
            }
            else if (user.contains("your name")) {
                System.out.println("ChatBot:I am a Rule-Based AI Chatbot developed using Java.");
            }
            else if (user.contains("help")) {
                System.out.println("ChatBot:I can assist you with Java, Python, greetings, motivation quotes and basic queries.");
            }
            else if (user.contains("joke")) {
                System.out.println("ChatBot:Why did the programmer quit his job? Because he didn't get arrays (a raise)!");
            }
            else if (user.contains("motivate")) {
                System.out.println("ChatBot:Keep going! Every expert was once a beginner. Success is near!");
            }
            else if (user.contains("ai")) {
                System.out.println("ChatBot:AI is Artificial Intelligence that helps machines think like humans.");
            }
            else {
                System.out.println("ChatBot:I’m still learning that. Try asking about Java, Python, jokes or help.");
            }
        }
        sc.close();
    }
}