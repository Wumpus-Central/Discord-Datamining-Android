.class Ld2/a$m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->l(Ld2/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/i;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/i;)V
    .locals 0

    iput-object p1, p0, Ld2/a$m0;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$m0;->k:Ld2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/a$m0;->l:Ld2/a;

    .line 2
    .line 3
    invoke-static {v0}, Ld2/a;->s0(Ld2/a;)Ld2/a$s0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ld2/a$s0;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ld2/a$m0;->l:Ld2/a;

    .line 14
    .line 15
    invoke-static {v0}, Ld2/a;->n0(Ld2/a;)Ld2/c0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v2, "Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information."

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Ld2/c0;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Ld2/a$m0;->l:Ld2/a;

    .line 28
    .line 29
    invoke-static {v0}, Ld2/a;->o0(Ld2/a;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Ld2/a$m0;->l:Ld2/a;

    .line 33
    .line 34
    iget-object v1, p0, Ld2/a$m0;->k:Ld2/i;

    .line 35
    .line 36
    invoke-static {v0, v1}, Ld2/a;->L(Ld2/a;Ld2/i;)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
.end method
