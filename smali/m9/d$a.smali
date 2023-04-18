.class public final Lm9/d$a;
.super Ll9/a$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/a$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lm9/d;
    .locals 2

    new-instance v0, Lm9/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm9/d;-><init>(Lm9/d$a;Lm9/e;)V

    return-object v0
.end method

.method public c()Lm9/d$a;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll9/a$a$a;->a:Ljava/lang/Boolean;

    return-object p0
.end method
