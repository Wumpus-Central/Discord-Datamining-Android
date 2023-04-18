.class final Lwc/a$b;
.super Lwc/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lwc/f;

.field private e:Lwc/d$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lwc/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lwc/d;
    .locals 8

    new-instance v7, Lwc/a;

    iget-object v1, p0, Lwc/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lwc/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lwc/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lwc/a$b;->d:Lwc/f;

    iget-object v5, p0, Lwc/a$b;->e:Lwc/d$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lwc/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwc/f;Lwc/d$b;Lwc/a$a;)V

    return-object v7
.end method

.method public b(Lwc/f;)Lwc/d$a;
    .locals 0

    iput-object p1, p0, Lwc/a$b;->d:Lwc/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lwc/d$a;
    .locals 0

    iput-object p1, p0, Lwc/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lwc/d$a;
    .locals 0

    iput-object p1, p0, Lwc/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lwc/d$b;)Lwc/d$a;
    .locals 0

    iput-object p1, p0, Lwc/a$b;->e:Lwc/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lwc/d$a;
    .locals 0

    iput-object p1, p0, Lwc/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
