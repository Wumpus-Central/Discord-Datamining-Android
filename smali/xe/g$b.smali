.class Lxe/g$b;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lxe/g;


# direct methods
.method private constructor <init>(Lxe/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxe/g$b;->a:Lxe/g;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lxe/g;Lxe/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lxe/g$b;-><init>(Lxe/g;)V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 7
    .line 8
    const/16 v0, 0xfa

    .line 9
    .line 10
    invoke-static {p1, v0}, Lxe/g;->o(Lxe/g;I)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 7
    .line 8
    invoke-static {p1, p2}, Lxe/g;->p(Lxe/g;Landroid/net/NetworkCapabilities;)Landroid/net/NetworkCapabilities;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 12
    .line 13
    invoke-virtual {p1}, Lxe/g;->s()V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method

.method public onLinkPropertiesChanged(Landroid/net/Network;Landroid/net/LinkProperties;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    invoke-static {p2}, Lxe/g;->m(Lxe/g;)Landroid/net/Network;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lxe/g$b;->a:Lxe/g;

    .line 10
    .line 11
    invoke-static {p2, p1}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 15
    .line 16
    const/16 p2, 0xfa

    .line 17
    .line 18
    invoke-static {p1, p2}, Lxe/g;->o(Lxe/g;I)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public onLosing(Landroid/net/Network;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    invoke-static {p2, p1}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 7
    .line 8
    invoke-virtual {p1}, Lxe/g;->s()V

    .line 9
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
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lxe/g;->p(Lxe/g;Landroid/net/NetworkCapabilities;)Landroid/net/NetworkCapabilities;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lxe/g$b;->a:Lxe/g;

    .line 13
    .line 14
    invoke-virtual {p1}, Lxe/g;->s()V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public onUnavailable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxe/g$b;->a:Lxe/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lxe/g;->n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lxe/g$b;->a:Lxe/g;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lxe/g;->p(Lxe/g;Landroid/net/NetworkCapabilities;)Landroid/net/NetworkCapabilities;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lxe/g$b;->a:Lxe/g;

    .line 13
    .line 14
    invoke-virtual {v0}, Lxe/g;->s()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
