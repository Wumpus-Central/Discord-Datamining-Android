.class public final Lg6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/b$c;,
        Lg6/b$b;
    }
.end annotation


# static fields
.field private static final a:Lg6/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg6/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg6/b$c;-><init>(Lg6/b$a;)V

    sput-object v0, Lg6/b;->a:Lg6/b$b;

    return-void
.end method

.method public static a(JLjava/lang/String;)Lg6/b$b;
    .locals 0

    sget-object p0, Lg6/b;->a:Lg6/b$b;

    return-object p0
.end method

.method public static b(J)Lg6/b$b;
    .locals 0

    sget-object p0, Lg6/b;->a:Lg6/b$b;

    return-object p0
.end method
