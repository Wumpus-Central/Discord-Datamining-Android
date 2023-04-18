.class public final Lcom/discord/simpleast/code/Xml;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/code/Xml$TagNode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\r\u001a\u001a\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u000f0\u0010\u0012\u0004\u0012\u0002H\u00110\u000e\"\u0004\u0008\u0000\u0010\u000f\"\u0004\u0008\u0001\u0010\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/discord/simpleast/code/Xml;",
        "",
        "()V",
        "PATTERN_XML_COMMENT",
        "Ljava/util/regex/Pattern;",
        "getPATTERN_XML_COMMENT",
        "()Ljava/util/regex/Pattern;",
        "PATTERN_XML_TAG",
        "getPATTERN_XML_TAG",
        "PATTERN_XML_TAG_CLOSING_GROUP",
        "",
        "PATTERN_XML_TAG_CONTENT_GROUP",
        "PATTERN_XML_TAG_OPENING_GROUP",
        "createTagRule",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "RC",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "codeStyleProviders",
        "Lcom/discord/simpleast/code/CodeStyleProviders;",
        "TagNode",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/code/Xml;

.field private static final PATTERN_XML_COMMENT:Ljava/util/regex/Pattern;

.field private static final PATTERN_XML_TAG:Ljava/util/regex/Pattern;

.field public static final PATTERN_XML_TAG_CLOSING_GROUP:I = 0x3

.field public static final PATTERN_XML_TAG_CONTENT_GROUP:I = 0x2

.field public static final PATTERN_XML_TAG_OPENING_GROUP:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/simpleast/code/Xml;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/simpleast/code/Xml;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/simpleast/code/Xml;->INSTANCE:Lcom/discord/simpleast/code/Xml;

    .line 7
    .line 8
    const-string v0, "^<!--[\\s\\S]*?-->"

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Pattern.compile(\"\"\"^<!--\u2026*?-->\"\"\", Pattern.DOTALL)"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/discord/simpleast/code/Xml;->PATTERN_XML_COMMENT:Ljava/util/regex/Pattern;

    .line 22
    .line 23
    const-string v0, "^<([\\s\\S]+?)(?:>(.*?)<\\/([\\s\\S]+?))?>"

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "Pattern.compile(\n      \"\u2026?))?>\"\"\", Pattern.DOTALL)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/discord/simpleast/code/Xml;->PATTERN_XML_TAG:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createTagRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RC:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/discord/simpleast/code/CodeStyleProviders<",
            "TRC;>;)",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TRC;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TRC;>;TS;>;"
        }
    .end annotation

    .line 1
    const-string v0, "codeStyleProviders"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/discord/simpleast/code/Xml$createTagRule$1;

    .line 7
    .line 8
    sget-object v1, Lcom/discord/simpleast/code/Xml;->PATTERN_XML_TAG:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, v1}, Lcom/discord/simpleast/code/Xml$createTagRule$1;-><init>(Lcom/discord/simpleast/code/Xml;Lcom/discord/simpleast/code/CodeStyleProviders;Ljava/util/regex/Pattern;)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final getPATTERN_XML_COMMENT()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/Xml;->PATTERN_XML_COMMENT:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_XML_TAG()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/Xml;->PATTERN_XML_TAG:Ljava/util/regex/Pattern;

    return-object v0
.end method
