.class public interface abstract Lij/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgj/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgj/t<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lfj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/c<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "COUNT_OF_PATTERN_SYMBOLS"

    .line 2
    .line 3
    const-class v1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgj/a;->e(Ljava/lang/String;Ljava/lang/Class;)Lfj/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lij/a;->b:Lfj/c;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
.end method


# virtual methods
.method public abstract I(Lfj/o;Ljava/lang/Appendable;Lfj/d;Lgj/j;CII)V
.end method

.method public abstract z(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;Lfj/q;)Ljava/lang/Integer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/text/ParsePosition;",
            "Lfj/d;",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/Integer;"
        }
    .end annotation
.end method
