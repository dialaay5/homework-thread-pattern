package com.theoreticalQuestions;

public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 2:");
        System.out.println("Connection pooling can improve the response time of any application that requires connections, especially Web-based applications.\n"+
                "With connection pooling, most user requests do not incur the overhead of creating a new connection because the data source can locate and use an existing connection from the pool of connections.\n");

        System.out.println("exercise 5:");
        System.out.println("לא נהוג להשתמש בפעולת סטופ מכיוון שלא יהיה זמן לת'ריד לנקות של הזכרון שלו, עדיף לשלוח הודעה לת'ריד לבטך את הפעולות\n"+
                           "it called CancellationToken\n");

        System.out.println("exercise 6:");
        System.out.println("כאשר הת'ריד סיים אי אפשר לעשות לא סטארט כי כל המשאבים שלו נוקו ,אז צריכים לייצר ת'ריד חדש ולהתחיל אותו\n");

        System.out.println("exercise 7:");
        System.out.println("תוכל לראות את רשימת התהליכים הפעילים כעת במחשב בחלון 'מנהל המשימות' באטב 'תהליכים', וכדי לראות את רשימת הת'רדים הרצים ניתן ללחוץ על 'פרטים נוספים'\n"+
                "מערכת ההפעלה זכאית לנהל את התהליכים לפי המשאבים הזמינים במחשב ולפי תיאום השימוש במקורות המשאבים בין התהליכים השונים. לכן, התהליכים מנוהלים על ידי מערכת ההפעלה ולא על ידי התוכנית שמריצה אותם.\n");

        System.out.println("exercise 8:");
        System.out.println("wait and notify: \n " +
                "עושים על ת'ריד אשר נגמרו לו המשאבים והחיבורים להמשיך ולרוץ לכן הוא עוזב את המפתיח והולך לחדר המתנה עד שיתפנה לו משאב ואז מעוררים אותו בחזרה שיקח אותו מפתיח וימשיך לרוץ\n");

        System.out.println("exercise 9:");
        System.out.println("race condition: \n " +
                "מצב שבו יותר מת'ריד אחד רצים במקביל ואחד מהם יכול לעקוף ולקבל את המפתיח ראשון.\n" +
                "context switch: \n" +
                "מצב שבו מעבד ליבה יקח ת'ריד ויריץ אותו עד שייגמר לו הזמן ואז יחזיר אותו ויקח ת'ריד אחר כלומר יחליף אותו בת'ריד אחר.\n");

        System.out.println("exercise 10.a :");
        System.out.println("ready to run: \n " +
                "מצב שבו הת'ריד ממתין למעבד ליבה שיבוא ויאסוף אותו להתחיל לרוץ.\n" +
                "running: \n" +
                "מצב שבו מעבד ליבה אוסף את הת'ריד ומתחיל לרוץ אותו שורה שורה בקוד.\n");

        System.out.println("exercise 10.b :");
        System.out.println(" wait(),wait(0): \n " +
                "באמצעות שיטה זו, הת'ריד ימתין ללא הגבלת זמן עד שמעוררים אותו באמצעות" + " notify(), notifyAll() .\n"  +
                "wait(timeout): \n" +
                "באמצעות שיטה זו, אנו יכולים לציין פסק זמן שאחריו הת'ריד יתעורר אוטומטית..\n");

        System.out.println("exercise 10.c :");
        System.out.println("unstarted\n");

        System.out.println("exercise 10.d :");
        System.out.println("runnable (ready to run) and after that to running with cpu \n");

        System.out.println("exercise 10.e :");
        System.out.println("wait()\n");

        System.out.println("exercise 10.f :");
        System.out.println("משחרר את הת'רידים בר מפתיח, למי שיש להם את אותו מפתיח.\n");

        System.out.println("exercise 11 :");
        System.out.println("המנעולים חייבים להיות אובייקטים, מכיוון שהם מספקים דרך לת'רידים לתאם את הגישה שלהם למשאבים משותפים ולסנכרן את הביצוע שלהם.\n");




























    }
}
