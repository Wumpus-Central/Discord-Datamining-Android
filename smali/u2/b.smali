.class public final Lu2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/b$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Lu2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lu2/b$a;
    .locals 2

    new-instance v0, Lu2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu2/b$a;-><init>(Lu2/q;)V

    return-object v0
.end method

.method static bridge synthetic c(Lu2/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu2/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu2/b;->a:Ljava/lang/String;

    return-object v0
.end method
