.class final Lio/sentry/g4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/g4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lio/sentry/o3;

.field private volatile b:Lio/sentry/j0;

.field private volatile c:Lio/sentry/Scope;


# direct methods
.method constructor <init>(Lio/sentry/g4$a;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object v0, p1, Lio/sentry/g4$a;->a:Lio/sentry/o3;

    iput-object v0, p0, Lio/sentry/g4$a;->a:Lio/sentry/o3;

    .line 7
    iget-object v0, p1, Lio/sentry/g4$a;->b:Lio/sentry/j0;

    iput-object v0, p0, Lio/sentry/g4$a;->b:Lio/sentry/j0;

    .line 8
    new-instance v0, Lio/sentry/Scope;

    iget-object p1, p1, Lio/sentry/g4$a;->c:Lio/sentry/Scope;

    invoke-direct {v0, p1}, Lio/sentry/Scope;-><init>(Lio/sentry/Scope;)V

    iput-object v0, p0, Lio/sentry/g4$a;->c:Lio/sentry/Scope;

    return-void
.end method

.method constructor <init>(Lio/sentry/o3;Lio/sentry/j0;Lio/sentry/Scope;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ISentryClient is required."

    .line 2
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/j0;

    iput-object p2, p0, Lio/sentry/g4$a;->b:Lio/sentry/j0;

    const-string p2, "Scope is required."

    .line 3
    invoke-static {p3, p2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/Scope;

    iput-object p2, p0, Lio/sentry/g4$a;->c:Lio/sentry/Scope;

    const-string p2, "Options is required"

    .line 4
    invoke-static {p1, p2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/o3;

    iput-object p1, p0, Lio/sentry/g4$a;->a:Lio/sentry/o3;

    return-void
.end method


# virtual methods
.method public a()Lio/sentry/j0;
    .locals 1

    iget-object v0, p0, Lio/sentry/g4$a;->b:Lio/sentry/j0;

    return-object v0
.end method

.method public b()Lio/sentry/o3;
    .locals 1

    iget-object v0, p0, Lio/sentry/g4$a;->a:Lio/sentry/o3;

    return-object v0
.end method

.method public c()Lio/sentry/Scope;
    .locals 1

    iget-object v0, p0, Lio/sentry/g4$a;->c:Lio/sentry/Scope;

    return-object v0
.end method
