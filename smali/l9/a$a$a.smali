.class public Ll9/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field protected a:Ljava/lang/Boolean;

.field protected b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll9/a$a$a;->a:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ll9/a$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll9/a$a$a;->a:Ljava/lang/Boolean;

    .line 3
    invoke-static {p1}, Ll9/a$a;->b(Ll9/a$a;)Ljava/lang/String;

    .line 4
    invoke-static {p1}, Ll9/a$a;->d(Ll9/a$a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ll9/a$a$a;->a:Ljava/lang/Boolean;

    .line 5
    invoke-static {p1}, Ll9/a$a;->c(Ll9/a$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll9/a$a$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ll9/a$a$a;
    .locals 0

    iput-object p1, p0, Ll9/a$a$a;->b:Ljava/lang/String;

    return-object p0
.end method
